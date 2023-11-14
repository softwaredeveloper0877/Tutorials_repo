import subprocess
import json

cmd = "git -C /home/muhtar/Desktop/Deneme_repo log --date=format:'%d/%m/%Y %H:%M:%S' -n2"
output_bytes = subprocess.check_output(cmd, shell=True)
output_text = output_bytes.decode("utf-8").split('\n')
output_text = [line for line in output_text if line.strip()] #bu satır çıktı içerisindeki elemanların içeriğini kontrol eder. elemanın içerisinde boşluk ve '\n' ifadesinden başka bir şey yoksa bu elemanı boş kabul eder ve bu elemanı dışarda bırakır
i = 0
while (i < len(output_text)):
    output_text[i] = str(output_text[i]).split(' ', 1)
    i += 1
i = 0
commit_number = int(cmd[-1])
wanted_string = ["","","",""]
json_list = []
key_vars = ["CommitID","Author","Date","CommitMessage"]
index = 1
indice = 0
while(i < len(output_text)):
    wanted_string[indice] = output_text[i][index]
    i += 1
    if(indice < len(wanted_string) - 1):
        indice += 1
    else:
        indice = 0
        json_list += wanted_string
i = -1
index = 0
indice = 0
json_commits = [{} for index in range(0, commit_number)]
print(type(json_commits))

while(index < len(json_commits)):
    i += 1
    json_commits[index][key_vars[i]] = json_list[indice]
    indice += 1 
    if (i == 3):
        i = -1
        index += 1

with open('Commits_Info.json', 'w') as json_dosya:
    json.dump(json_commits,json_dosya, indent = 4, ensure_ascii=False)

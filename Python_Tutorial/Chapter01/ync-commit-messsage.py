#!/usr/bin/env python3
import subprocess

cmd = "git log --oneline --author='softwaredeveloper0877' -n 10"
output_bytes = subprocess.check_output(cmd, shell=True)
output_text = output_bytes.decode("utf-8")
new_line = 0
index = 0
row = 1
while (index != -1):
    new_line = output_text.find('\n', index)
    index += 1
    if (index >= len(output_text)):
        exit()
    elif (output_text[index] == ' '):
        print(str(row) + ':' + output_text[index:new_line])
        index = new_line
        row += 1

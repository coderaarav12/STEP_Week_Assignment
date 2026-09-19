import os
import re

def remove_comments(text):
    # Regex to remove block comments and line comments
    # It handles string literals so it doesn't remove URLs inside strings, etc.
    pattern = r'(\".*?\"|\'.*?\')|(/\*.*?\*/|//[^\r\n]*$)'
    # first group captures quoted strings (single and double)
    # second group captures comments (// and /*...*/)
    regex = re.compile(pattern, re.MULTILINE|re.DOTALL)
    def _replacer(match):
        # if the 2nd group is not None, then we have captured a comment -> return empty
        if match.group(2) is not None:
            return ''
        else: # otherwise, we have captured a quoted string -> return the string
            return match.group(1)
    
    cleaned = regex.sub(_replacer, text)
    # Remove empty lines that may have resulted
    cleaned = re.sub(r'^\s*$\n', '', cleaned, flags=re.MULTILINE)
    return cleaned.strip()

base_dirs = [
    r'C:\Users\aarav\OneDrive\Desktop\step assignment\weekwise java codes',
    r'C:\Users\aarav\OneDrive\Desktop\step assignment\practice_java_codes'
]

for base_dir in base_dirs:
    for root, dirs, files in os.walk(base_dir):
        for file in files:
            if file.endswith('.java'):
                path = os.path.join(root, file)
                with open(path, 'r', encoding='utf-8') as f:
                    content = f.read()
                
                cleaned_content = remove_comments(content)
                
                with open(path, 'w', encoding='utf-8') as f:
                    f.write(cleaned_content)
                print(f"Cleaned {path}")

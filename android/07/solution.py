import base64
from Crypto.Cipher import AES
from Crypto.Hash import MD5
import re

uuid = re.compile(".*-.*-.*-.*")
enc = ""
abytes = base64.b64decode(enc)

iv = abytes[0:16]
data = abytes[16:]

for x in range(0, 10000):
    pin = "%04d" % x
    h = MD5.new()
    h.update(pin.encode())
    key = h.digest()[0:16]    
    try:
        cipher = AES.new(key, AES.MODE_CBC, iv)
        clear = cipher.decrypt(data)
        if uuid.match(str(clear)):
            print(clear)
    except Exception as e:
        print(e)
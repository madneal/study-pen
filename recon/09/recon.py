import requests

def main():
    for i in range(256):
        print(i)
        prefix = hex(i) if len(hex(i)) == 4 else hex(i).replace('0x', '0x0')
        print(prefix)
        host = "http://" + prefix + ".a.hackycorp.com"
        print(host)
        r = requests.get(host)
        print(r.text)
        img = requests.get(host + "/logo.png")
        with open(prefix + ".png", "wb") as f:
            f.write(img.content)
        
if __name__ == "__main__":
    main()
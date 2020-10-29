import requests

def main():
    while True:
        res = requests.get("http://balancer.hackycorp.com")
        print(res.text)

if __name__ == "__main__":
    main()
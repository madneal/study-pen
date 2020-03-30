import string

def main():
    word = "hello"
    for ele in word:
        ele_b = get_character(ele)

def compute_by_and(word):
    for ele in word:
        ele_b, times = get_character(ele)
        print(f"Guess the value {ele_b}:{chr(ele_b)} with {times} times")

def get_character(char):
    char_b = ord(char)
    value = 0
    times = 0
    for i in range(7):
        times = times + 1
        if char_b & (2 ** i):
            value = value + (2 ** i)
    return value, times

def brute_force(word):
    times = 0
    for ele in word:
        for c in string.printable:
            times = times + 1
            if ele == c:
                break
    print(f"Brute force {word} with {times} times")

def binary_search(low, high, value):
    times = 0
    while low < high:
        times = times + 1
        mid = low + (high - low) // 2
        print(mid)
        if mid < value:
            low = mid + 1
        else:
            high = mid
    return times

def compute_by_binary_search(word):
    for ele in word:
        times = binary_search(0, 127, ord(ele))
        print(f"Guess the value {ele}:{ord(ele)} with {times} times")

if __name__ == "__main__":
    compute_by_binary_search("myapp")
  
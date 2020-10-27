# Getting the Android application

For this challenge, you can download the Android application using the following link: android_08.apk

# This challenge

In this challenge, the application requires a pin code to give you the key. However, you don't have the pin.

There are two ways to solve this exercise. The first way to solve this exercise is to use apktool like you did before. apktool will give extract the application's code as smali code. You will be able to browse the source code in the smali directory. However, it's not very intuitive but it's enough for this exercise.

The second way is to extract the application yourself using unzip. From there, you should see a file named classes.dex. You can then use the tool dex2jar to convert the dex file to a jar file. Once this is done, you can either unzip the jar file to browse the code or use jd-gui.

This time the code has been minimised using ProGuard. This makes reversing the application more complex.

By inspecting the smali code or the java code, you should be able to find the way the key has been encrypted. This time, proper encryption is used with AES. However, the key is not hardcoded. The key is based on the pin code and a string downloaded from a server. So you will need to write a small tool to brute force the decryption key based on the pin and the string. The pin is composed of 4 digits and use as a String ("0000" instead of 0). The string and the pin are hashed together before being used as a key. You will need to follow the same process to test your tool and get the key to score this challenge.
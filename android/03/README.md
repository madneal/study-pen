# Getting the Android application

In this challenge, you can download the Android application using the following link: android_03.apk

# This challenge

In this challenge, the application requires a pin code to give you the key. However, no pin code is set so you will not be able to retrieve the key.

There are two ways to solve this exercise. The first way to solve this exercise is to use apktool like you did before. apktool will give extract the application's code as smali code. You will be able to browse the source code in the smali directory. However, it's not very intuitive but it's enough for this exercise.

The second way is to extract the application yourself using unzip. From there, you should see a file named classes.dex. You can then use the tool dex2jar to convert the dex file to a jar file. Once this is done, you can either unzip the jar file to browse the code or use jd-gui.

By inspecting the smali code or the java code, you should be able to find the key to solve this exercise.
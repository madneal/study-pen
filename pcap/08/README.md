# Getting started with this badge

To get started, you will need to install Wireshark to perform the inspect of the network dump provided.

# Getting the PCAP file

In this challenge, you can download the PCAP file using the following link: pcap_08.pcap

# This challenge

In this challenge, the file contains the network traffic captured during a SMTP connection to send an email. By inspecting the TCP connection you will see that the user provides a username and password to log in (they are both base64 encoded as part of the protocol).

You should see the following exchange:

AUTH LOGIN
334 VXNlcm5hbWU6
dmljdGlt
334 UGFzc3dvcmQ6
[...]
Where:

AUTH LOGIN is the client telling the server it wants to log in
VXNlcm5hbWU6 is the base64 of Username:
dmljdGlt is the base of the username.
UGFzc3dvcmQ6 is the base64 of Password:
Using Wireshark, you should be able to retrieve the content of the connection using "Follow TCP Stream". Using that, you should be able to see the username and the password (the key to solve this exercise) used to connect to the server (after base64-decoding it).
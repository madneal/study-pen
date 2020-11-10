# Getting started with this badge

To get started, you will need to install Wireshark to perform the inspect of the network dump provided.

# Getting the PCAP file

In this challenge, you can download the PCAP file using the following link: pcap_07.pcap

# This challenge

In this challenge, the file contains a rlogin connection to a server. Connecting to a server using rlogin is insecure as the credentials are transmitted in cleartext. By inspecting the packets, you should be able to get the password used to log in.

Using Wireshark, you should be able to retrieve the content of the connection using "Follow TCP Stream". Using that, you should be able to see the username and the password (the key to solve this exercise) used to connect to the server.
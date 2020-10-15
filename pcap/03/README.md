# Getting started with this badge

To get started, you will need to install Wireshark to perform the inspect of the network dump provided.

# Getting the PCAP file

In this challenge, you can download the PCAP file using the following link: pcap_03.pcap

# This challenge

In this challenge, the file only contains the TCP connection of a user connecting to a server using FTP. Connecting with FTP without TLS is insecure as anyone who can see the traffic, or access a packet capture of the connection is able to see the username and password used as well as all the files retrieved by the user.

Using Wireshark, you should be able to retrieve the content of the connection using "Follow TCP Stream". Using that, you should be able to see the username and the password (the key to solve this exercise) used to connect to the server.
# Getting started with this badge

To get started, you will need to install Wireshark to perform the inspect of the network dump provided.

# Getting the PCAP file

In this challenge, you can download the PCAP file using the following link: pcap_06.pcap

# This challenge

In this challenge, the file contains the connection of the root user to a server using rsh. The trust relationship between the client is the server is performed by creating a .rhosts file on the server with the IP of the client. This is obviously very insecure.

Using Wireshark, you should be able to retrieve the content of the connection using "Follow TCP Stream". Using that, you should be able to see the file thet gets retrieved (the key to solve this exercise).
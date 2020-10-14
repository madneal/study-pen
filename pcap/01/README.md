# Getting started with this badge

To get started, you will need to install Wireshark to perform the inspect of the network dump provided.

# Getting the PCAP file

In this challenge, you can download the PCAP file using the following link: pcap_01.pcap

# This challenge

In this challenge, the file only contains a single TCP connection from the client to the server. The client connects to the server and write the following string:

The key is ....
Using Wireshark, you can open the file. Once the file is loaded, you should be able to right-click and select "Follow" -> "TCP Stream". This command will open a new window with the full TCP connection. This command basically reconstruct the connection so you're able to inspect the data without having to worry about the lower layer (IP and ARP).
Getting started with this badge
To get started, you will need to install Wireshark to perform the inspect of the network dump provided.

Getting the PCAP file
In this challenge, you can download the PCAP file using the following link: pcap_04.pcap

This challenge
In this challenge, the file only contains the FTP connection of a client retrieving a file in passive mode. The retrieval of the file happens in two stages/TCP connections:

The client authenticates and tells the server what file it wants to retrieve followed by the PASV command. The server will send back an IP address and port to the server. You can see the port and IP by inspecting the packet after the PASV command. You will need to explore the content of the packet to see the IP and port.
The client connects to that IP and port to retrieve the file.
Using Wireshark, you should be able to retrieve the content of the file using "Follow TCP Stream" on the right TCP connection. Using that, you should be able to see the content of the file retrieved (the key to solve this exercise).
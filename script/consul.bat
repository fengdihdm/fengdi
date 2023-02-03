@echo off 
color 09
D:\software\consul_1.14.4_windows_amd64\consul.exe agent -server -bootstrap-expect=1 -ui -bind=127.0.0.1 -client=0.0.0.0 -data-dir=D:/toolsworkspace/consul/data -config-dir=D:/toolsworkspace/consul

package com.remote.client;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;


public interface InterfaceClient extends Remote{
    //chức năng này để truy xuất các thông báo của cuộc thảo luận từ máy chủ
    void retrieveMessage(String message) throws RemoteException;
    
    //chức năng này để khôi phục các tệp được chia sẻ của cuộc thảo luận từ máy chủ
    void retrieveMessage(String filename,ArrayList<Integer> inc) throws RemoteException;
    
    //chức năng này để gửi tin nhắn từ máy khách đến máy chủ
    void sendMessage(List<String> list) throws RemoteException;
    
    //chức năng này để truy xuất tên của các máy khách được kết nối (mã định danh máy khách) ==> tên người dùng
    String getName()throws RemoteException;
    
    //chức năng này để hủy kích hoạt chức năng gửi tin nhắn cho khách hàng
    void closeChat(String message) throws RemoteException;
    
    //chức năng này để kích hoạt chức năng gửi tin nhắn cho khách hàng
    void openChat() throws RemoteException;
}

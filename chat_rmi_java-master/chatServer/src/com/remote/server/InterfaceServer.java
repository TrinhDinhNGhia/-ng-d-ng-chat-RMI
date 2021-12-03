package com.remote.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import com.remote.client.InterfaceClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public interface InterfaceServer extends Remote{
    //chức năng này để phân phối thông báo cho tất cả các máy khách được kết nối
    void broadcastMessage(String message,List<String> list) throws RemoteException;
    
    //chức năng này để phân phối một tệp được chia sẻ cho tất cả các máy khách được kết nối
    void broadcastMessage(ArrayList<Integer> inc,List<String> list,String filename) throws RemoteException;
    
    //chức năng này để truy xuất tên của các máy khách được kết nối
    Vector<String> getListClientByName(String name) throws RemoteException;
    
    //chức năng này để thêm một máy khách được kết nối vào danh sách các máy khách được kết nối
    void addClient(InterfaceClient client) throws RemoteException;
    
    //chức năng này để chặn khách hàng gửi tin nhắn nhưng anh ta có thể nhận được tin nhắn
    void blockClient(List<String> clients) throws RemoteException;
    
    //chức năng này để xóa hoàn toàn danh sách khách hàng trò chuyện (kick-out)
    void removeClient(List<String> clients) throws RemoteException;
    
    //chức năng này để loại bỏ hoàn toàn một ứng dụng trò chuyện duy nhất (kick-out)
    void removeClient(String clients) throws RemoteException;
    
    //chức năng này để kích hoạt một ứng dụng khách đang trò chuyện, sau khi ở trong trường hợp "chặn"
    void reactiveClient(List<String> clients) throws RemoteException;
    
    //chức năng này để xác minh xem tên người dùng đã tồn tại trong máy chủ hay chưa, vì tên người dùng là định danh trên trò chuyện
    boolean checkUsername(String username) throws RemoteException;
}
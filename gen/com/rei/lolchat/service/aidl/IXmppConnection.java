/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/robi/projects/android/beam/beam/src/com/rei/lolchat/service/aidl/IXmppConnection.aidl
 */
package com.rei.lolchat.service.aidl;
public interface IXmppConnection extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.rei.lolchat.service.aidl.IXmppConnection
{
private static final java.lang.String DESCRIPTOR = "com.rei.lolchat.service.aidl.IXmppConnection";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.rei.lolchat.service.aidl.IXmppConnection interface,
 * generating a proxy if needed.
 */
public static com.rei.lolchat.service.aidl.IXmppConnection asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.rei.lolchat.service.aidl.IXmppConnection))) {
return ((com.rei.lolchat.service.aidl.IXmppConnection)iin);
}
return new com.rei.lolchat.service.aidl.IXmppConnection.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_connect:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.connect();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_login:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.login();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_connectSync:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.connectSync();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_connectAsync:
{
data.enforceInterface(DESCRIPTOR);
this.connectAsync();
reply.writeNoException();
return true;
}
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.disconnect();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getRoster:
{
data.enforceInterface(DESCRIPTOR);
com.rei.lolchat.service.aidl.IRoster _result = this.getRoster();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_addConnectionListener:
{
data.enforceInterface(DESCRIPTOR);
com.rei.lolchat.service.aidl.IBeemConnectionListener _arg0;
_arg0 = com.rei.lolchat.service.aidl.IBeemConnectionListener.Stub.asInterface(data.readStrongBinder());
this.addConnectionListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeConnectionListener:
{
data.enforceInterface(DESCRIPTOR);
com.rei.lolchat.service.aidl.IBeemConnectionListener _arg0;
_arg0 = com.rei.lolchat.service.aidl.IBeemConnectionListener.Stub.asInterface(data.readStrongBinder());
this.removeConnectionListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isAuthentificated:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isAuthentificated();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getChatManager:
{
data.enforceInterface(DESCRIPTOR);
com.rei.lolchat.service.aidl.IChatManager _result = this.getChatManager();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_changeStatusAndPriority:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.changeStatusAndPriority(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_changeStatus:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.changeStatus(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getPrivacyListManager:
{
data.enforceInterface(DESCRIPTOR);
com.rei.lolchat.service.aidl.IPrivacyListManager _result = this.getPrivacyListManager();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getErrorMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getErrorMessage();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.rei.lolchat.service.aidl.IXmppConnection
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public boolean connect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean login() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_login, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean connectSync() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_connectSync, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void connectAsync() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_connectAsync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean disconnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public com.rei.lolchat.service.aidl.IRoster getRoster() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.rei.lolchat.service.aidl.IRoster _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRoster, _data, _reply, 0);
_reply.readException();
_result = com.rei.lolchat.service.aidl.IRoster.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void addConnectionListener(com.rei.lolchat.service.aidl.IBeemConnectionListener listen) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listen!=null))?(listen.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addConnectionListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void removeConnectionListener(com.rei.lolchat.service.aidl.IBeemConnectionListener listen) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listen!=null))?(listen.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeConnectionListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean isAuthentificated() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isAuthentificated, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public com.rei.lolchat.service.aidl.IChatManager getChatManager() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.rei.lolchat.service.aidl.IChatManager _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getChatManager, _data, _reply, 0);
_reply.readException();
_result = com.rei.lolchat.service.aidl.IChatManager.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void changeStatusAndPriority(int status, java.lang.String msg, int priority) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeString(msg);
_data.writeInt(priority);
mRemote.transact(Stub.TRANSACTION_changeStatusAndPriority, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void changeStatus(int status, java.lang.String msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeString(msg);
mRemote.transact(Stub.TRANSACTION_changeStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public com.rei.lolchat.service.aidl.IPrivacyListManager getPrivacyListManager() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.rei.lolchat.service.aidl.IPrivacyListManager _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrivacyListManager, _data, _reply, 0);
_reply.readException();
_result = com.rei.lolchat.service.aidl.IPrivacyListManager.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getErrorMessage() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getErrorMessage, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_login = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_connectSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_connectAsync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getRoster = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_addConnectionListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_removeConnectionListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_isAuthentificated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getChatManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_changeStatusAndPriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_changeStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getPrivacyListManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getErrorMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
}
public boolean connect() throws android.os.RemoteException;
public boolean login() throws android.os.RemoteException;
public boolean connectSync() throws android.os.RemoteException;
public void connectAsync() throws android.os.RemoteException;
public boolean disconnect() throws android.os.RemoteException;
public com.rei.lolchat.service.aidl.IRoster getRoster() throws android.os.RemoteException;
public void addConnectionListener(com.rei.lolchat.service.aidl.IBeemConnectionListener listen) throws android.os.RemoteException;
public void removeConnectionListener(com.rei.lolchat.service.aidl.IBeemConnectionListener listen) throws android.os.RemoteException;
public boolean isAuthentificated() throws android.os.RemoteException;
public com.rei.lolchat.service.aidl.IChatManager getChatManager() throws android.os.RemoteException;
public void changeStatusAndPriority(int status, java.lang.String msg, int priority) throws android.os.RemoteException;
public void changeStatus(int status, java.lang.String msg) throws android.os.RemoteException;
public com.rei.lolchat.service.aidl.IPrivacyListManager getPrivacyListManager() throws android.os.RemoteException;
public java.lang.String getErrorMessage() throws android.os.RemoteException;
}

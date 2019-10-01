package com.dendickys.myasynctaskexpert;

public interface MyAsyncCallback {
    void onPreExecute();
    void onPostExecute(String text);
}

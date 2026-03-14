#include<bits/stdc++.h>
using namespace std;
void stairCase(int n){
    int stair = 0;
    for(int i = 1 ; i <= n ; i++){
        if(i%2 == 1)    stair+=2;
        for(int j = 1 ; j <= stair; j++)    cout<<"*";
        cout<<endl;
        
    }
}
void printA(int n){
    int col = (n/2)+1;
    for(int i = 1 ; i <= n ; i++){
        for(int j = 1 ; j <= col ; j++){
            if(i==1 && (j==1 || j == col))    cout<<" ";
            else if(i == 1 || i == col || j == 1  || j == col)    cout<<"*";
            else    cout<<" ";
        }
        cout<<endl;
    }
}
void Alpha1(int n){
    char ch = 'A';
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j <= i ; j++)   cout<<char(ch+j);
        cout<<endl;
    }
}
void Alpha4(int n){
    char ch = 'A';
    for(int i = n ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++)   cout<<char(ch+j);
        cout<<endl;
    }
}
void Alpha3(int n){
    char ch = 'A';
    for(int i = n - 1 ; i >= 0 ; i--){
        for(int j = i ; j <= n-1 ; j++)    cout<<char(ch+j);
        cout<<endl;
    }
}void Alpha5(int n){
    char ch = 'A';
    for(int i = n-1 ; i >= 0 ; i--){
        for(int j = n-1 ; j >= 0 ; j--) cout<<char(ch+i);
        cout<<endl;
    }
}
void Alpha2(int n){
    char ch = 'A';
    for(int i = 0 ; i < n ; i++){
        for(int j = i ; j < n ; j--)   cout<<char(ch+i);
        cout<<endl;
    }
}
int main(){
    int n;
    cin>>n;
    // stairCase(n);
    // printA(n);
    // Alpha1(n);
    // Alpha2(n);
    // Alpha3(n);
    // Alpha4(n);
    Alpha5(n);
    return 0;
}

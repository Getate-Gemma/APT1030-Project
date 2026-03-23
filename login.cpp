// login.cpp

#include <iostream>
using namespace std;

int main() {
    string username, password;

    cout << "Enter username: ";
    cin >> username;

    cout << "Enter password: ";
    cin >> password;

    if (username == "adminKE" && password == "254Secure") {
        cout << "Access Granted";
    } else {
        cout << "Invalid Credentials";
    }

    return 0;
}
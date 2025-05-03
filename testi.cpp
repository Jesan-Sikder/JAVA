#include <iostream>
using namespace std;

int main() {
    string args[] = {"Hello", "World"};
    int argc = 2; // Number of arguments
    for (int i = 0; i < argc; i++) {
        cout << "Argument " << i << ": " << args[i] << endl;
    }
    return 0;
}
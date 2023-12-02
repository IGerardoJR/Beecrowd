// BEE 1094 - Experiments - Level 3
#include <iostream>
#include <list>

using namespace std;

int main(int argc, char const *argv[])
{

    // Testing the array list
    list<int> miLista = {};

    list<int>::iterator it;

    miLista.push_front(10);
    miLista.push_front(20);
    miLista.push_back(30);
    miLista.push_front(50);
    

    for(it =miLista.begin(); it != miLista.end(); it++)
    {
        cout<<*it<<endl;
    }

    

    return 0;
}

// BEE 1094 - Experiments - Level 3
#include <iostream>
#include <list>

using namespace std;

int main(int argc, char const *argv[])
{

    // // Testing the array list
    // list<int> NumeroAnimales = {};
    // list<int>::iterator it;


    int totalConejos = 0;
    int totalRatones = 0;
    int totalSapos = 0;

    // Number of cases
    int n;
    scanf("%d",&n);
    
    char animal;
    int cantidad = 0;

    cout<<"El valor de N es: "<<n<<endl;

    for(int i = 0 ; i<10; i++)
    {
        // Numero | Animal
        scanf("%d %s\n",&cantidad,&animal);

        // Sumamos a la cuenta acorde a cada caso
        if((int)animal == 67)
        {
            totalConejos += cantidad;
        }
        else if((int)animal == 82)
        {
            totalRatones += cantidad;
        }

        else if((int)animal == 83)
        {
            totalSapos += cantidad;
        }
        totalConejos += cantidad;
    }

    // Mostramos totales.
    int totalAnimales = totalConejos + totalRatones + totalSapos;
    cout<<"Total: "<<totalAnimales<<" cobaias"<<endl;
    cout<<"Total de coelhos: "<<totalConejos<<endl;
    cout<<"Total de ratos: "<<totalRatones<<endl;;
    cout<<"Total de sapos: "<<totalSapos<<endl;;
    // Porcentajes
    cout<<"Percentual de coelhos: "<<(float)(totalConejos * 100) / totalAnimales <<endl;
    cout<<"Percentual de ratos: "<<(float)(totalRatones * 100) / totalAnimales <<endl;
    cout<<"Percentual de sapos: "<<(float)(totalSapos * 100) / totalAnimales <<endl;

    return 0;
}


// Datos a recolectar
/*
    Total de animales
    Numero en especifico de los siguientes animales
    {
        Total de coelhos(conejos)
        Total de ratos
        Total de sapos
    }
    Del total de animales sacar el porcentaje de
    {
        coelhos(conejos)
        ratos
        sapos
    }
    


*/
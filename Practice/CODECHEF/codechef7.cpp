#include <iostream>
using namespace std;

class Codechef7{
    
    public:
    int GCD(int a, int b)
    {
        int gcd = 1; 
        for(int i = 1; i <= a && i <= b; i++){
            if(a%i==0 && b%i==0)
            gcd = i;  
        }
        return gcd;
    }
    int LCM(int a, int b)
    {
        int gcd = 1;
        for(int i = 1; i <= a && i <= b; ++i)   
        {
            if(a % i == 0 && b % i == 0)
            gcd = i;  
        }
        int lcm = (a * b) / gcd;
        return lcm;
    }
};

int main()
{
    Codechef7 obj;

        int n;
        scanf("%d", &n);
        int a, num, count = 0;
        string s1;
        int countarr[n];

        for (int i = 0; i < n; i++) {
            scanf("%d", &num);
            int arr1[num];
            for (int j = 0; j < num; j++) {
                    scanf("%d", &a);
                    arr1[j] = a;
                }
            for (int j = 0; j < num; j++) {
                for (int j2 = j+1; j2 < num; j2++) {
                    if (obj.GCD(arr1[j], arr1[j2]) == obj.LCM(arr1[j], arr1[j2])) {
                        count ++;
                    }
                }
            }
            countarr[i] = count;
            count = 0;
        }
        for (int i = 0; i < n; i++) {
            printf("%d\n", countarr[i]);
        }
    return 0;
}

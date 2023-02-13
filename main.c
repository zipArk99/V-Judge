#include <stdio.h>
void setup()
{
    // pinMode(5,OUTPUT);
    // digitalWrite(5,HIGH);
    char ch;
    printf("Enter a Character::");
    scanf("%c", &ch);
    void blink()
    {
        digitalWrite(5, HIGH);
        delay(500);
        digitalWrite(5, LOW);
        delay(500);
    }
    switch (ch)
    {
    case 'a':
        blink();
        break;
    case 'b':
        blink();
        blink();
        break;
    case 'c':
        blink();
        blink();
        blink();
        break;
    }
}

void loop()
{
    digitalWrite(5, HIGH);
    delay(500);
    digitalWrite(5, LOW);
    delay(500);
}

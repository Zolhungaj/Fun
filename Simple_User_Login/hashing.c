#include <stdio.h>
long int hash_string_with_salt();
long int hash_string();
int main(int argc, char** argv)
{
  if(argc<2)
  {
    printf("USAGE: hashing [argument to be hashed]\n");
    return 1;
  }
  if(argc<3)
  {
    printf("%ld\n",hash_string(argv[1]));
  }else
  {
    printf("%ld\n",hash_string_with_salt(argv[1],hash_string(argv[2])));
  }
  return 0;
}
long int hash_string(const char* str)
{
  hash_string_with_salt(str,0);
}
long int hash_string_with_salt(const char* str, long int salt)
{
  /*this is not a good hashing function,
  it's easy to guess the size of the input by the output
  it might work fine otherwise*/
    long int hash = 39581+salt;
    /*this is just a semirandom number, was orignally 39582, but that is divisible by two*/
    int c;
    int i;

    i=0;
    while(c = str[i])
    {
      hash += c << (i*4%23);
      hash += hash >> (i%4);
      i++;
    }
    return hash;
}

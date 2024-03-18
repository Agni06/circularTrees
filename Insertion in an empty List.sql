static Node addToEmpty(Node last, int data)
{
if(last != null)
  {
    return last;
  }

  temp = new Node(data);
  last = temp;
temp.next = last;
return last;
  
}

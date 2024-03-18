static Node addBegin(Node last, int data) 
  {
  if(last==null)
  {
    return addToEmpty(last, data);
  }
  temp = new Node(data);
  temp.next = last.next;
  last.next = temp;
  return last;
  }

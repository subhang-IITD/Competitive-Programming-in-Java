int fracCompare(pair p1,pair p2){
    long f = p1.x*p2.y, s = p2.x*p1.y ;
    if(f > s) return 1 ;
    else if(f==s) return 0;
    return -1; 
}

void reducedFrac(pair p){
    long g = gcd(p.x,p.y);
    p.x /=g; p.y /=g; 
}

pair p1 = new pair(3, 4);  // Represents the fraction 3/4
pair p2 = new pair(6, 8);  // Represents the fraction 6/8
int result = fracCompare(p1, p2);  // result will be 0 (because 3/4 == 6/8)

pair p = new pair(6, 8);  // Represents the fraction 6/8
reducedFrac(p);           // Now p is reduced to 3/4

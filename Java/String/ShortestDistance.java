
class ShortestDistance{
    public static void main(String[] args) {
        String a = "wneew";

        System.out.println(FindDistance(a,0,0));
        
    }
    public static int FindDistance(String a ,int pt1, int pt2){
        char arr[] = a.toCharArray();
        
        int x=0;
        int y=0;

        for(int i =0; i<a.length(); i++){
            if(arr[i] == 'n'){
                    y = y+1;
            }
            else if(arr[i] == 'e'){
                x= x+1;
            }

            else if(arr[i] == 'w'){
                x= x-1;
            }

            else if(arr[i] == 's'){
                y = y-1;
            }

        }

        int d1 = (pt1 -x);
        int d2 = (pt2 -y);

        int dis1 = d1 * d1;
        int dis2 = d2 * d2;

        int distance = (int) Math.sqrt(dis1 + dis2);

        return distance;

        
    }
}
class StringExample{
            public static void main(String args[]){
                String city = "Number";
                System.out.println(" City = "+city);

                // length() function
                int len = city.length();
                System.out.println("Length of City is = "+len);

                // indexOf() function
                int index1 = city.indexOf('g');
                System.out.println("Index of 'g' is = "+index1);

                // lastIndexOf() function
                int index2 = city.lastIndexOf('g');
                System.out.println("Index of 'g' is = "+index2);

                //charAt() function
                char ch = city.charAt(6);
                System.out.println("Character at index is = "+ch);

            }
        }
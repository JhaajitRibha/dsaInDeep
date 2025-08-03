package striverDsaSheet.ArraysPartOne.twoPascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangleA1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        outerList.add(innerList);
        for(int i=1;i<numRows;i++){
            List<Integer> innerLists = new ArrayList<>();
            innerLists.add(1);
            for(int j=1;j<outerList.get(i-1).size();j++){
                innerLists.add(outerList.get(i-1).get(j-1)+outerList.get(i-1).get(j));
            }
            innerLists.add(1);
            outerList.add(innerLists);
        }
       return outerList;
    }
    public static void main(String[] args) {
      List<List<Integer>>  res = new pascalTriangleA1().generate(30);
        res.stream()
                .map(row -> row.toString())
                .forEach(System.out::println);

    }
}

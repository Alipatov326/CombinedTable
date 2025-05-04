public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2){
        table1 = t1;
        table2 = t2;
    }

    public boolean canSeat(int numPeople){
        return (table1.getNumSeats() + table2.getNumSeats() - 2) >= numPeople;
    }

    public double getDesirability(){
        if (table1.getHeight() == table2.getHeight()){
            return (table1.getViewQuality() + table2.getViewQuality()) / 2;
        }
        else{
            return ((table1.getViewQuality() + table2.getViewQuality()) / 2) - 10;
        }
    }
}

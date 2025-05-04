public class SingleTable
{
    private int numSeats;
    private int height;
    private double viewQuality;


    public SingleTable(int seats, int height, double viewQuality){
            numSeats = seats;
            this.height = height;
            this.viewQuality = viewQuality;
    /* implementation not shown */ }
    /** Returns the number of seats at this table. The value is always greater than or equal to 4. */
    public int getNumSeats(){
        return numSeats;
        /* implementation not shown */
    }
    /** Returns the height of this table in centimeters. */
    public int getHeight()
    {
        return height;
        /* implementation not shown */ }
    /** Returns the quality of the view from this table. */
    public double getViewQuality()
    {
        return viewQuality;
        /* implementation not shown */ }
    /** Sets the quality of the view from this table to value . */
    public void setViewQuality(double value)
    {
        viewQuality = value;
        /* implementation not shown */ }
// There may be instance variables, constructors, and methods that are not shown.
}
package Access_Modifier.Police;

public class cop
{
    private int gun;
    public cop(int gun)
    {
        this.gun=gun;
    }
    protected void CanIShoot()
    {
        System.out.println("Yes you can shoot"+gun);
    }
}

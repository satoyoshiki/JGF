package hu.list.tuple;

import hu.list.HUMapper;

import java.io.Serializable;

public class HUTuple4<T0 extends Comparable<T0>, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>>
        implements Comparable<HUTuple4<T0, T1, T2, T3>>, Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 7103249881456289151L;

    private T0  el0;

    private T1  el1;

    private T2  el2;

    private T3  el3;

    private int hashCode = 0;

    public HUTuple4(T0 el0, T1 el1, T2 el2, T3 el3)
    {
        this.el0 = el0;
        this.el1 = el1;
        this.el2 = el2;
        this.el3 = el3;
    }

    public T0 el0()
    {
        return el0;
    }

    public T1 el1()
    {
        return el1;
    }

    public T2 el2()
    {
        return el2;
    }

    public T3 el3()
    {
        return el3;
    }

    @Override
    public int compareTo(HUTuple4<T0, T1, T2, T3> o)
    {
        return this.el0.compareTo(o.el0) != 0 ? this.el0.compareTo(o.el0) : this.el1.compareTo(o.el1) != 0 ? this.el1.compareTo(o.el1) : this.el2.compareTo(o.el2) != 0 ? this.el2.compareTo(o.el2) : this.el3.compareTo(o.el3) != 0 ? this.el3.compareTo(o.el3) : 0;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof HUTuple4))
        {
            return false;
        }
        @SuppressWarnings("unchecked")
        HUTuple4<T0, T1, T2, T3> oo = (HUTuple4<T0, T1, T2, T3>) o;
        return this.el0.equals(oo.el0) && this.el1.equals(oo.el1)
                && this.el2.equals(oo.el2) && this.el3.equals(oo.el3);
    }

    public int hashCode()
    {
        if (hashCode == 0)
        {
            int result = 17;
            result = 37 * result + el0.hashCode();
            result = 37 * result + el1.hashCode();
            result = 37 * result + el2.hashCode();
            result = 37 * result + el3.hashCode();
            hashCode = result;
        }
        return hashCode;
    }

    public String toString()
    {
        return "(" + el0.toString() + ", " + el1.toString() + ", "
                + el2.toString() + ", " + el3.toString() + ")";
    }

    public <U0 extends Comparable<U0>, U1 extends Comparable<U1>, U2 extends Comparable<U2>> HUTuple3<U0, U1, U2> map(
            HUMapper<HUTuple4<T0, T1, T2, T3>, HUTuple3<U0, U1, U2>> mapper)
    {
        return mapper.apply(this);
    }
}

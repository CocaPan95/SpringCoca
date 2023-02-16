package domain;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Orderss {
    public Long OrderId;
    public String OrderNo;
    public Integer UserId;
    public Integer Status;
    public String Comment;
    public Date CreateTime;
    public Date UpdateTime;
    public Boolean Vaild;
}


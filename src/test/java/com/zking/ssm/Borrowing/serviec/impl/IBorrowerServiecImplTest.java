package com.zking.ssm.Borrowing.serviec.impl;

import com.zking.ssm.Borrowing.serviec.IBorrowerServiec;
import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.base.model.BorrowerType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author mi
 * @create 2019-05-03 20:15
 */
public class IBorrowerServiecImplTest extends BaseTestCase{

    @Autowired
    private IBorrowerServiec borrowerServiec;
    private Borrower borrower;

    @Override
    public void before() {
        super.before();
        borrower=new Borrower();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        borrower.setbName("教育");
        borrower.setbUsername("jid");
        borrower.setbRate(14);
        borrower.setbMoney(9888.0);
        borrower.setbPhone("13333333333");
        borrower.setbHouse(3);
        borrower.setbTotalValue(98888833.0);
        borrower.setbUse("jajshnj");
        borrower.setbDescribe("1wwqasa");
        borrower.setbCondition(2);
        borrower.setbBorrowerType(2);
        borrower.setbBidcount(14);
        borrower.setbStatus(0);
        borrowerServiec.insert(borrower);

    }

    @Test
    public void selectByPrimaryKey() {
        borrower.setbId(1);
        Borrower b = borrowerServiec.selectByPrimaryKey(borrower.getbId());
        System.out.println(b);
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void listBorrower() {

        List<Borrower> b = borrowerServiec.listBorrower(borrower, pageBean);
        for (Borrower br : b) {
            System.out.println();
            for (BorrowerType bt : br.getBorrowerTypeList()) {
                System.out.println(bt.getbTypeName());
            }
        }
    }


}
package 은행만들기;

public class BankMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오",1000);
        Bank shinhan = new Bank("신한은행",1000);
        Bank nh = new Bank("농협",0);

        kakao.setDeposit(3500);
        kakao.viewAccount();


        System.out.println(Bank.getCount());
    }
}

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) != null) {
            return findBranch(branchName).newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) != null) {
            return findBranch(branchName).addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        if (findBranch(branchName) != null) {
            System.out.println("Customer details for branch " + findBranch(branchName).getName());
            ArrayList<Customer> customerList = findBranch(branchName).getCustomers();
            for (int i = 0; i < customerList.size(); i++) {
                Customer customer = customerList.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactionList = customer.getTransactions();
                    for (int j = 0; j < transactionList.size(); j++) {
                        System.out.println("[" + (j + 1) + "]" + "  Amount " + transactionList.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}


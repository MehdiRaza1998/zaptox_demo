/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeks.foodysoft.dao;


import geeks.foodysoft.beans.BorrowRecords;
import geeks.foodysoft.beans.Branch;
import geeks.foodysoft.beans.Category;
import geeks.foodysoft.beans.Discount;
import geeks.foodysoft.beans.Permission;
import geeks.foodysoft.beans.Product;
import geeks.foodysoft.beans.ReturnProduct;
import geeks.foodysoft.beans.Sales;
import geeks.foodysoft.beans.SalesDetails;
import geeks.foodysoft.beans.User;
import geeks.foodysoft.beans.UserType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface DbManagerInterface {

    public ArrayList<User> getAllUsers();
   public User getUser(int user_id);
   public int updateUser(User user);
   public int deleteUser(User user);
   public int insertUser(User user);
   public User userAuthentication(String username, String password);
   
   public ArrayList<UserType> getAllUsersType();
   public UserType getUserType(int user_type_id);
   public int updateUserType(UserType userType);
   public int deleteUserType(UserType userType);
   public int insertUserType(UserType userType);
   
   
   public ArrayList<Product> getAllProducts();
   public ArrayList<Product> getAllProductsSearch(String search);
   public Product getProduct(int product_id);
   public int updateProduct(Product product);
   public int deleteProduct(Product product);
   public int insertProduct(Product product);
   
   public ArrayList<Permission> getAllPermissions();
   public Permission getPermission(int permission_id);
   public int updatePermission(Permission permission);
   public int deletePermission(Permission permission);
   public int insertPermission(Permission permission);
   
   public ArrayList<SalesDetails> getAllSalesDetails();
   public SalesDetails getSalesDetails(int sales_details_id);
   public int updateSalesDetails(SalesDetails salesDetails );
   public int deleteSalesDetails(SalesDetails salesDetails);
   public int insertSalesDetails(SalesDetails salesDetails);
   
  
   public ArrayList<Sales> getAllSales();
   public Sales getSales(int sales_id);
   public int updateSales(Sales sales);
   public int deleteSales(Sales sales);
   public int insertSales(Sales sales);
   
   public ArrayList<Discount> getAllDiscounts();
   public Discount getDiscount(int discount_id);
   public int updateDiscount(Discount discount);
   public int deleteDiscount(Discount discount);
   public int insertDiscount(Discount discount);
   
   
   
 
   public ArrayList<Category> getAllCategory();
   public Category getCategory(int category_id);
   public int updateCategory(Category category);
   public int deleteCategory(Category category);
   public int insertCategory(Category category);
   
   
   public ArrayList<BorrowRecords> getAllBorrowRecords();
   public Category getBorrowRecords(int borrow_id);
   public int updateBorrowRecords(BorrowRecords b);
   public int deleteBorrowRecords(BorrowRecords b);
   public int insertBorrowRecords(BorrowRecords b);
   
   public ArrayList<Branch> getAllBranch();
   public Category getBranch(int branch_id);
   public int updateBranch(Branch b);
   public int deleteBranch(Branch b);
   public int insertBranch(Branch b);
   
   public ArrayList<ReturnProduct> getAllReturnProduct();
   public Category getReturnProduct(int return_id);
   public int updateReturnProduct(ReturnProduct b);
   public int deleteReturnProduct(ReturnProduct b);
   public int insertReturnProduct(ReturnProduct b);
   
   
   
   
}

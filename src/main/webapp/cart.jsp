<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>SHIRT Cart</title>
    <link rel="stylesheet" href="cart.css" type="text/css"/>
</head>


    <h1>Your cart</h1>
    
    <table>
      <tr>
        <th>Quantity</th>
        <th>Name</th>
        <th>Image</th>
        <th>Description</th>
        <th>Price</th>
        <th></th>
      </tr>
      <c:forEach var="item" items="${cart.items}">
      <tr>
        <td>
            <form action="cart" method="post">
                <input type="hidden" name="productId" 
                       value="<c:out value='${item.product.id}'/>">
                
                <input type=text name="quantity" 
                       value="<c:out value='${item.quantity}'/>"  
                       id="quantity">
                <input type="submit" value="Update">
            </form>
        </td>
        <td><c:out value='${item.product.name}'/></td><br>
        <td><c:out value='${item.product.imageLocation}'/></td>
        <td><c:out value='${item.product.description}'/></td>
        <td><c:out value='${item.product.price}'/></td>  
        <td>
            <form action="cart" method="post">
                <input type="hidden" name="productId" 
                       value="<c:out value='${item.product.id}'/>">
                <input type="hidden" name="quantity" value="0">
                <input type="submit" value="Remove Item">
            </form>
        </td>
      </tr>
      </c:forEach>
    </table>

    <p><b>To change the quantity</b>, enter the new quantity 
        and click on the Update button.</p>

    <form action="" method="post">
        <input type="hidden" name="action" value="shop">
        <input type="submit" value="Continue Shopping">
    </form>

    <form action="" method="post">
        <input type="hidden" name="action" value="checkout">
        <input type="submit" value="Checkout">
    </form>

    <p>&copy; Copyright ${currentYear} Mike Murach &amp; Associates, Inc.
        All rights reserved.</p>

</body>
  

</html>
# StateDesignPattern

## Problem:
<p>A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific 
   rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.
</p>

## Requirements:

1. Idle State:
     <ul>
       <li>Allow item selection.</li>
      <li>Disallow dispensing items and inserting coins.</li>
     </ul>
2. ItemSelected State:
     <ul>
      <li>Allow inserting cons and dispensing items.</li>
      <li>Disallow item selection</li>
     </ul>
3. Dispensing State:
   <ul>
      <li>Allow no operations.</li>
      <li>Automatically transition back to the "Idle" state after dispensing is complete.</li>
   </ul>
4. OutOfOrder State:
    <ul>
      <li>Disallow all operations.</li>
   </ul>

## Current System: 
<p>The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. 
   This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.
</p>

**Implement the State Pattern to improve code maintainability and flexibility:**
1. Define VendingMachine States:
     <ul>
       <li>Create seperate classes representing different machine states: IdleState,
           ItemSelectedState, DispensingState, and OutOfOrderState.</li>
     </ul>
2. ItemSelected State:
     <ul>
      <li>Define an interface VendingMachineState with methods for common actions like selectedItem,
          insertCoin, DispenseItem, and setOutOrder</li>
     </ul>
3. Implement State Behaviors:
   <ul>
      <li>Each concrete state class implements the VendingMachineState interface, providing specific behavior for its respective state. For example, 
          the IdleState class would allow item selection, while the OutOfOrderState wouldn't allow any operations.</li>
   </ul>
4. Update VendingMachine Class:
    <ul>
      <li>Include attributes for item inventory and balance.</li>
      <li>Remove state-specific logic from the VendingMachine class.</li>
      <li>Introduce a reference to the current VendingMachineState object.</li>
      <li>Delegate actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder to the current state object through its corresponding methods.</li>
   </ul>






   
    
     
   
      

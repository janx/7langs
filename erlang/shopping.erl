-module(shopping).
-export([totals/1]).

totals(ShoppingList) -> [{Item, Quantity*Price} || {Item, Quantity, Price} <- ShoppingList].

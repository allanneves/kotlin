package collections

/*
*
*   MutableIterable   <---    Iterable
*        |                       |
*        |                       |
*        v                       v
*  MutableCollection  <---   Collection
*     |     |                    |
*     |     |                    |
*     |     |                    |
*     |     |         List <-----|----->  Set               Map
*     |     |          |                   |                 |
*     |     |          |                   |                 |
*     |     |          |                   v                 v
*     |     |-------------------------> MutableSet       MutableMap
*     |                |
*     |                v
*     |-----------> MutableList
* */
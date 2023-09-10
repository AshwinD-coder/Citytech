**Chapter-1 Clean Code**
1. Bad code brings company down.
2. As the bad code increases , productivity decreases.
3. Code sense is important for a programmer to see options and variations in messy code.
4. Keep code simple, direct , efficient ,understandable , testable.
5. Minimize dependencies, classes, methods, functions.
6. No Duplication.
7. Expressive meaningful names.
8. Simple tiny abstraction.
9. Care about Code.
10. **Boy Scout Rule** : Leave the campground cleaner than you found it.

**Chapter-2 Meaningful Names**
1. Use Intention Revealing Names that are descriptive and simple.
2. Make distinct meaningful names.
3. Use pronounceable and searchable names.
4. **Avoid Encodings** : Don't use Hungarian Notations, append member prefixes and type information.
5. Special encodings for interface. Example: ShapeFactoryImp , CShapeFactory.
6. **Avoid Mental Mappings** : avoid single letter names that readers must map mentally.
7. Class Names must be noun or noun phrases not a verb like Customer, WikiPage, Account.
8. Method Names must be verb or verb phrase like postPayment, deletePage.
9. Accessor , mutator, predicate methods name should use prefixes like get, set, is .
10. **Don't be Cute** : Avoid sense of humor names, slang's, culture joke names.
11. **Pick One Word per Concept** : Choose one name concept among many similar concepts . Example : [Fetch, Retrieve, Get] , [Manager, Controller, Driver]
12. **Don't Pun**: Avoid using same names for  semantically different concepts.
13. Use Solution Domain Names and Problem Domain Names.
14. Add meaningful context using prefixes. Note : Add no more context than necessary(Short and simple is better than long ones).
# StepProgressBar
This is a step progress bar using custom view with parallelogram shape bar. It will help to understand how to make own custom view in android 

#### CustomView
The Android framework provides several default views. The base class a view is the View. Views are responsible for measuring, layouting and drawing themselves and their child elements. Views are also responsible for saving their UI state and handling touch events

#### Important fact about view :

Each View have own life cycle and have some call back method which help to manage own view. When we create constructor then call back method calls.

### OnAttachedToWindow()--->measure()--->onMeasure()--->layout()--->onLayout()--->dispatchDraw()--->draw()--->onDraw()--->onDetachedToWindow()

These are main call back method. **onDraw()** and **onMeasure()** method is very important.I will explain in my Blog separately.
Let's move on my demo to explain all these things.

First, we create a new file and keep **name attrs.xml**.In that file we keep all attribute related custome view.after that create a class which extends View class. After that need to override callback method, under **onDraw()** we create how parallelogram view.

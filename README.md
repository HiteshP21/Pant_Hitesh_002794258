# Data Visualization


 
## Data Visualization Recipe 

### Any code and notebooks related to the lessons will be found in this directory.  

Types of Visualization (The Why?)
* Explanatory (Communicate something to a larger audience)

  Primarily used to communicate intricate patterns or findings to a larger audience. This type of visualization streamlines complex data, transforming it into easily digestible visuals that resonate with the audience's understanding.
* Exploratory (Find out interesting aspects/patterns in the data)

  Aimed at uncovering hidden patterns, relationships, and trends within the data. This is instrumental for data scientists and analysts during the initial phases of data analysis when they are trying to gain insights and generate hypotheses.
* Confirmatory (Visual evidence for an assertion/hypothesis)

  Offers a visual means to provide evidence in support of a specific assertion or hypothesis. It ensures that the conclusions drawn are based on factual evidence represented in the visualization.

Check the data! GIGO (Garbage-in, garbage-out):  It's crucial to ensure data quality before diving into visualization. Feeding flawed or irrelevant data will result in misleading visuals, hence the term "garbage in, garbage out."
* Missing values?: Ensure that there aren't significant gaps in your dataset that might skew results. Tools and techniques for data imputation can help address this.
* Data types : Understanding the nature of your data is pivotal.
    * Categorical, Nominal, Ordinal: Classifications without a particular order or with a hierarchy.
    * Numeric: Quantifiable data that can be measured.
    * Strings & Dates: Textual data and specific time points or durations.
* Descriptive statistics: A preliminary overview of data.
    * Numeric: Using methods like .describe() to get count, mean, standard deviation, etc.
    * Categorical: Evaluate using Shannon entropy to measure unpredictability, count unique values, and ascertain the frequency of each value.
* Data type attributes (GPS, Sequence/Time-series, Nodes/Edges) - User feedback

  It's essential to understand the context.
    * GPS: Geographical points
    * Sequence/Time-series: Data points arranged in time order
    * Nodes/Edges: Data points representing network connections, needing feedback from users to interpret significance.

* Data structure (Tabular, Graph, Time-series, Hierarchical, Geographic, Map, Network, etc.) - User feedback

  Knowing the structure helps in selecting the right visualization.
    * Tabular, Graph, Time-series, Hierarchical, Geographic, Map, Network, etc. Each offers different insights and requires unique visualization techniques.
* Data type semantics (Spatial, Temporal) - User feedback

  Semantic meaning can influence interpretation.
    * Spatial: Relating to space
    * Temporal: Relating to time
* Outliers? (Numeric Box-whisker x times (deflaut 1.5) interquartile range, categorical would be rare values/low % default < 1%)

  These are unusual data points that can heavily influence the overall visualization.
    * Numeric: Use Box-whisker plots to identify values that fall outside the interquartile range.
    * Categorical: Identify rare values or those that occur less frequently.

To do:
* Enough data (Power)?

  * Sample Size: Ensure your dataset is large enough to draw valid conclusions and to represent the population or phenomenon you're studying accurately.
  * Quality of Data: The quality of your data is more important than the quantity. Your data should be accurate, consistent, and up-to-date.
  * Variance and Standard Error: Analyze the variance and standard error to know the reliability of your data. Smaller standard errors indicate more reliable data.
  * Power Analysis: Conduct a power analysis to determine the minimum sample size needed for your analysis to be reliable.
  
* Is the data stationary? <a href='https://www.youtube.com/watch?v=R69TZFNEao4'>See Video</a>   
  * Stationary data is data that exhibits a consistent statistical behavior over time. This kind of data has statistical properties such as mean, variance, and autocorrelation that do not change significantly across different time intervals.
  * This is important to evaluate when analyzing because many statistical methods and models assume stationarity. If the data is not actually stationary, it can be more challenging to analyze and model accurately.
  * Techniques to convert data to stationary data:
     * Differencing:
       * First-Order Differencing: Most commonly used. This involves calculating the difference between consecutive data points.
       * Seasonal Differencing: Used when there is a seasonal component (e.g., data with recurring patterns over a fixed time period). Seasonal differencing involves subtracting the value of the series at the same point in the previous season.
       * Higher-Order Differencing: Used if first-order differencing doesn't make the data stationary. Perform second-order (or higher-order) differencing by applying the differencing operation multiple times.
     * Transformation:
       * Log Transformation: Taking the natural logarithm (or other appropriate transformations like square root or cube root) of the data can stabilize variance and make it more consistent across time, especially if the data exhibits exponential growth.
       * Box-Cox Transformation: The Box-Cox transformation is a family of power transformations that includes the logarithm as a special case. It can be used to find the transformation that best stabilizes the variance and makes the data approximately normal.
       * Other Transformations: Depending on the characteristics of the data, other transformations like taking the inverse or applying a polynomial transformation may be used.
* Is the data biased?


Fix data issues and log what was done
* Impute missing values<br>
  Type of missing values:<br>
  * Missing completely at Random:<br>
    The missing value has absolutely no relation with other observations.<br>
  * Missing Data not at Random:<br>
      There is a relationship between missing value and other observations.<br>
  * Missing at Random:<br>
      Some values are missing at random.<br>

  Imputation Techniques:<br>
  * Mean, median, Mode:<br>
    **Assumption**: Data is missing completely at random.<br>
      Operation:<br>
      Replacing the NaN with most frequently occurring variable based on mean, median or mode.<br>

  * Random Sample imputation:<br>
    **Assumption**: Data is missing completely at random.<br>
      Operation:<br>
      Taking random observation from given dataset and replace the NaNs with these observations.<br>

  * End of Distribution:<br>
    **Assumption**: Data not missing completely at random.<br>
    Operation:<br>
    Replace NaN in the dataset with the values at the extremes (outliers)<br>
    This technique takes outliers into consideration.<br>

  * Capturing NaN with a new feature:<br>
    **Assumption**: Data NOT missing completely at random.<br>
      Operation:<br>
      Replace the NaN in dataset with a new feature. ex: 0 and 1<br>
      Can also be replaced with a variable (for categorical variable). ex: “Missing”.<br>



Arbitrary Value Imputation:
	Operation:
	Arbitrary value should not be the most frequent values.
	Replace the NAN value with arbitrary value such as the extreme values in the dataset or any other values other than mean, median or mode.

Frequent Category Imputation:
	Assumption: The amount of missing value is low.
	Operation:
	Find the number of missing values.
	If there are few missing values: replace the missing values with most frequent value.



* Remove outliers  
* Adjust for bias 
* Upsample
* Create synthetic data 

Feature selection 
* Which features are important?
* Partial dependencies/marginal contributions of each feature    
* Relations between the features  
* Dependencies between the features  

Scale, normalize and transform
* When to scale?
* When to normalize?
* When to transform?

Graphical components
* X-position  
* Y - position  
* Color  
* Marks - Shape (Points, Bars,Lines, Areas, Volumes)  
* Channels (Position, Size, Angle/Slope, Color/Intensity/Hue,Texture)
* Animation    
* Faceting (small multiples) 


Chart types and fundamental graphs   
* Bar chart  (Categorical versus numeric)  
* Scatter plot (Numeric versus numeric)  
* Line graphs (Sequence versus numeric) 
* Matrix (Rows versus columns)  
* Maps (Transformation)  

See the Data Visualisation Catalogue  <a href='https://datavizcatalogue.com'>https://datavizcatalogue.com</a>   



Legends, labels, annotations, and typeface  
* How to design and choose legends, labels, annotations and type   


Visual cognitive effectiveness   
* Quality of Data    
* Accuracy   
* Discriminability    
* Salience    
* Clutter  
* Grouping  


 
 
## Data Visualization Design

A collection of data visualization chart choosers, reference guides, cheat sheets, websites, books, tutorials and infographics about data visualization design.


*The Data Visualisation Catalogue* 

The Data Visualisation Catalogue <a href='https://datavizcatalogue.com'>https://datavizcatalogue.com</a>  

The Data Visualisation Catalogue is a project developed by <a href='http://www.severinoribecca.one'>Severino Ribecca</a> to create a library of different information visualisation types. The website serves as a learning and inspiration resource for those working with data visualisation. 


*The Chart Chooser Dissected*  

Identify the most effective graphical elements to use in your presentation from <a href='https://www.qlik.com/blog/third-pillar-of-mapping-data-to-visualizations-usage'>The Chart Chooser</a>. Decide what charts will provide the most convincing display of your quantitative evidence. 

Download a <a href='https://extremepresentation.typepad.com/files/choosing-a-good-chart-09.pdf'>pdf</a> of the chart chooser. 

*Financial Times Visual Vocabulary* 

A <a href='https://github.com/Financial-Times/chart-doctor/tree/main/visual-vocabulary'>PDF poster</a> (available in English, Japanese, traditional Chinese and simplified Chinese) to assist designers and journalists to select the optimal symbology for data visualisations, by the <a href='https://www.ft.com/visual-and-data-journalism'>Financial Times Visual Journalism Team</a>.  


*The Data Viz Project*  

The <a href='https://datavizproject.com'>Data Viz Project</a> is a website trying to present all relevant data visualizations, so you can find the right visualization and get inspired how to make them. It started out as an internal tool box at ferdio, an infographic and data visualization agency in Copenhagen, and grew into a public website where you and others can use it as a tool and inspiration.

*From Data to Viz*  

From <a href='https://www.data-to-viz.com/'>Data to Viz</a> is on online, interactive chart chooser that leads you to the most appropriate graph for your data. It also links to the code to build it (R, Python and D3) and lists common caveats you should avoid.

Also available as the poster shown. You can download the <a href='https://www.data-to-viz.com/#poster_full'>high-resolution image</a> or <a href='https://www.data-to-viz.com/poster.html'>Buy the Printed Poster.</a>



*The Data Visualization Checklist*  

This is a collaboration from Stephanie Evergreen & Ann K. Emery. The <a href='https://stephanieevergreen.com/wp-content/uploads/2020/12/EvergreenDataVizChecklist.pdf'>Data Visualization Checklist</a> is a compilation of 24 guidelines on how graphs should be formatted to best show the story in your data. The 24 guidelines are broken down into 5 sections: Text, Arrangement, Color, Lines, and Overall.

*Graph Selection Matrix*  

The <a href='https://www.perceptualedge.com/images/Effective_Chart_Design.pdf'>Graph Selection Matrix</a> comes from Stephen Few’s book, Show Me The Numbers, and is available as a stand-alone <a href='https://www.perceptualedge.com/images/Effective_Chart_Design.pdf'>PDF</a> download.

 
*Visualizing Percentages & Parts of a Whole*
 
Working with percentages is very common, and one of the most challenging parts of designing data visualizations. 


You can download a PDF of the reference sheet here: <a href='https://static1.squarespace.com/static/59df9853cd0f68dd29301c12/t/5c54cc23652dea724570e8c4/1549061155345/Visualizing-Percentages-20-Ways-InfoNewt.pdf'>Visualizing-Percentages-20-Ways-InfoNewt.pdf</a>     


*Graphic Cheat Sheet*  

The <a href='https://www.billiondollargraphics.com/GCS.pdf'>Graphic Cheat Sheet</a> was designed by Mike Parkinson, and is a very popular handout distributed at his conference talks. He has updated it numerous times over the years, and it’s available to download as a PDF. 60 different graphic types are grouped as Simple, Complex or Quantitative and shown when they can apply to be used to communicate 13 different types of data.


*The Chart Guide 4.0* 

Michiel Dullaert created the <a href='https://chart.guide/wp-content/uploads/2019/10/ChartGuide-402-web.pdf'>Chart Guide</a> for his data visualization classes, and has made it available to everyone through the website chart.guide as a downloadable <a href='https://chart.guide/wp-content/uploads/2019/10/ChartGuide-402-web.pdf'>PDF</a> or for purchase as a <a href='https://chart.guide/poster/'>printed poster</a>.


*Play Your Charts Right*  

Play Your Charts Rights is a free, downloadable <a href='https://www.geckoboard.com/uploads/play-your-charts-right.pdf'>PDF poster</a> with 12 great data visualization tips from Geckoboard. They will also send you a print poster upon request! Hang it in the office as a constant reminder for your team!

*How To Think Visually Using Visual Analogies*  

This <a href='https://blog.adioma.com/wp-content/uploads/2017/02/how-to-think-visually-using-visual-analogies-infographic.png'>infographic</a> from Anna Vital at Adioma groups 72 different visualization methods into four main categories: Charts & Diagrams, Abstract Analogies, Analogies, and Allegories. This goes beyond the traditional numerical data visualization methods to include more conceptual visual styles and diagrams often used in business environments.


*Qualitative Chart Chooser*   

Stephanie Evergreen and Jennifer Lyons collaborated to create the Qualitative Chart Chooser as a downloadable <a href='https://stephanieevergreen.com/wp-content/uploads/2021/07/Qualitative-Chooser.pdf'>PDF</a> to help researchers working with text, concept sand relationship data where traditional charts don’t apply. Version 2.0 includes two pages with a visual display of the chart types and decision matrix to help choose the appropriate display of information. There is also an updated Version 3.0 of the decision matrix.


<a href=''></a>

 
## Data Visualization articles and links 

The full content of the poster, along with links to related material, including research and examples of best practice. _This is a work in progress._

### General

* National Geographic: [Taking data visualisation from eye candy to efficiency](http://news.nationalgeographic.com/2015/09/150922-data-points-visualization-eye-candy-efficiency/)
* William S. Cleveland and Robert McGill: [Graphical Perception: Theory, Experimentation, and Application to the Development of Graphical Methods](http://info.slis.indiana.edu/~katy/S637-S11/cleveland84.pdf)
* Hadley Wickham: [A Layered Grammar of Graphics](http://vita.had.co.nz/papers/layered-grammar.pdf)
* Tracey L. Weissgerber et al: [Beyond Bar and Line Graphs: Time for a New Data Presentation Paradigm](http://journals.plos.org/plosbiology/article?id=10.1371/journal.pbio.1002128)
* Numeroteca: [Uses and abuses of data visualisations in mass media](http://numeroteca.org/2016/05/18/uses-and-abuses-of-data-visualizations-in-mass-media/)
* Andy Cotgreave: [The inevitability of data visualization criticism](http://www.computerworld.com/article/3048315/data-analytics/the-inevitability-of-data-visualization-criticism.html)
* Alberto Cairo: ["Our reader" won't understand something as complicated as that!](http://www.thefunctionalart.com/2016/05/our-reader-wont-understand-something-as.html)
* Alberto Cairo: [Visualization's expanding vocabulary](http://www.thefunctionalart.com/2016/05/visualizations-expanding-vocabulary.html)

### Deviation

Emphasise variations (+/-) from a fixed reference point. Typically the reference point is zero but it can also be a target or a long-term average. Can also be used to show sentiment (positive/neutral/negative). *Example FT uses:* Trade surplus/deficit, climate change

#### Diverging bar

A simple standard bar chart that can handle both negative and positive magnitude values.

* Chart Doctor: [How the FT explained Brexit](https://www.ft.com/content/3bfc0aac-4ccd-11e6-88c5-db83e98a590a)

#### Diverging stacked bar

Perfect for presenting survey results which involve sentiment (eg disagree/neutral/agree).

#### Spine chart

Splits a single value into 2 contrasting components (eg Male/Female)

#### Surplus/deficit filled line

The shaded area of these charts allows a balance to be shown – either against a baseline or between two series.

### Correlation

Show the relationship between two or more variables. Be mindful that, unless you tell them otherwise, many readers will assume the relationships you show them to be causal (i.e. one causes the other). *Example FT uses:* Inflation & unemployment, income & life expectancy

* Chart Doctor: [The German election and the trouble with correlation](https://www.ft.com/content/94e3acec-a767-11e7-ab55-27219df83c97)

#### Scatterplot

The standard way to show the relationship between two continuous variables, each of which has its own axis.

* Chart Doctor: [The storytelling genius of unveiling truths through charts](https://www.ft.com/content/e2eba288-ef83-11e6-930f-061b01e23655)
* Maarten Lambrechts: [7 reasons you should use dot graphs](http://www.maartenlambrechts.com/2015/05/03/to-the-point-7-reasons-you-should-use-dot-graphs.html)
* Tim Brock: [Too Big Data: Coping with Overplotting](https://www.infragistics.com/community/blogs/tim_brock/archive/2015/04/21/too-big-data-coping-with-overplotting.aspx)
* Sara Kehaulani Goo: [The art and science of the scatterplot](http://www.pewresearch.org/fact-tank/2015/09/16/the-art-and-science-of-the-scatterplot/)
* Chart Doctor: [The storytelling genius of unveiling truths through charts](https://www.ft.com/content/e2eba288-ef83-11e6-930f-061b01e23655)
* *Examples:* [_FT_](https://www.ft.com/content/1ce1a720-ce94-3c32-a689-8d2356388a1f)

#### Line + Column

A good way of showing the relationship between an amount (columns) and a rate (line)

* Data Revelations: [Be Careful with Dual Axis Charts](http://www.datarevelations.com/be-careful-with-dual-axis-charts.html)
* DataHero: [The Do’s and Don’ts of Dual Axis Charts](https://datahero.com/blog/2015/04/23/the-dos-and-donts-of-dual-axis-charts/)
* Harvard Business Review: [Beware Spurious Correlations](https://hbr.org/2015/06/beware-spurious-correlations)

#### Connected scatterplot

Usually used to show how the relationship between two variables has changed over time.

* Robert Kosara: [The Connected Scatterplot for Presenting Paired Time Series](https://eagereyes.org/papers/the-connected-scatterplot-for-presenting-paired-time-series)
* Data Revelations: [Be Careful with Dual Axis Charts](http://www.datarevelations.com/be-careful-with-dual-axis-charts.html)
* *Examples:* [_Washington Post_](https://www.washingtonpost.com/apps/g/page/business/the-end-of-the-us-oil-boom-told-through-one-texas-companys-bust/1999/)

#### Bubble

Like a scatterplot, but adds additional detail by sizing the circles according to a third variable 

* Chart Doctor: [The storytelling genius of unveiling truths through charts](https://www.ft.com/content/e2eba288-ef83-11e6-930f-061b01e23655)
* *Examples:* [_FT_](https://ig.ft.com/managements-missing-women-data/)

#### XY heatmap

A good way of showing the patterns between 2 categories of data, less good at showing fine differences in amounts.

* Chart Doctor: [Use fewer maps to illustrate data better](https://www.ft.com/content/de3ef722-9514-11e6-a1dc-bdf38d484582)

### Ranking

Use where an item’s position in an ordered list is more important than its absolute or relative value. Don’t be afraid to highlight the points of interest. *Example FT uses:* Wealth, deprivation, league tables, constituency election results

#### Ordered bar

Standard bar charts display the ranks of values much more easily when sorted into order

#### Ordered column

See above.

#### Ordered proportional symbol

Use when there are big variations between values and/or seeing fine differences between data is not so important.

#### Dot strip plot

Dots placed in order on a strip are a space-efficient method of laying out ranks across multiple categories.

#### Slope

Perfect for showing how ranks have changed over time or vary between categories. 

#### Lollipop chart

Lollipops draw more attention to the data value than standard bar/column and can also show rank and value effectively.

### Distribution

Show values in a dataset and how often they occur. The shape (or ‘skew’) of a distribution can be a memorable way of highlighting the lack of uniformity or equality in the data. *Example FT uses:* Income distribution, population (age/sex) distribution

* Joey Cherdarchuk: [Visualising distributions](http://www.darkhorseanalytics.com/blog/visualizing-distributions-3)

#### Histogram

The standard way to show a statistical distribution - keep the gaps between columns small to highlight the ‘shape’ of the data

* Aran Lunzer and Amelia McNamara: [Exploring histograms](http://tinlizzie.org/histograms/)

#### Boxplot

Summarise multiple distributions by showing the median (centre) and range of the data

#### Violin plot

Similar to a box plot but more effective with complex distributions (data that cannot be summarised with simple average).

#### Population pyramid

A standard way for showing the age and sex breakdown of a population distribution; effectively, back to back histograms.

#### Dot strip plot

Good for showing individual values in a distribution, can be a problem when too many dots have the same value.

#### Dot plot

A simple way of showing the change or range (min/max) of data across multiple categories. 

#### Barcode plot

Like dot strip plots, good for displaying all the data in a table,they work best when highlighting individual values.

* Maarten Lambrechts: [Interactive strip plots for visualizing demographics](http://www.maartenlambrechts.com/2015/11/30/interactive-strip-plots-for-visualizing-demographics.html)

#### Cumulative curve

A good way of showing how unequal a distribution is: y axis is always cumulative frequency, x axis is always a measure.

### Change over Time

Give emphasis to changing trends. These can be short (intra-day) movements or extended series traversing decades or centuries. Choosing the correct time period is important to provide suitable context for the reader. *Example FT uses:* Share price movements, economic time series

* Flowing Data: [11 Ways to Visualize Changes Over Time – A Guide](http://flowingdata.com/2010/01/07/11-ways-to-visualize-changes-over-time-a-guide/)

#### Line 

The standard way to show a changing time series. If data are irregular, consider markers to represent data points 

* Chart Doctor: [A chart’s ability to mislead is off the scale](https://www.ft.com/content/3062d082-e3da-11e6-8405-9e5580d6e5fb)
* Office for National Statistics: [Does the axis have to start at zero? (Part 1 – line charts)](https://blog.ons.digital/2016/06/27/does-the-axis-have-to-start-at-zero-part-1-line-charts/)
* Quartz: [It's OK not to start your y-axis at zero](https://qz.com/418083/its-ok-not-to-start-your-y-axis-at-zero/)
* Vox: [Shut up about the y-axis. It should't always start at zero](https://www.youtube.com/watch?v=14VYnFhBKcY)
* Emily Schuch: [How to Make a Line Chart that Doesn't Lie](http://emschuch.github.io/Planned-Parenthood/)

#### Column 

Columns work well for showing change over time - but usually best with only one series of data at a time.

* Chart Doctor: [A chart’s ability to mislead is off the scale](https://www.ft.com/content/3062d082-e3da-11e6-8405-9e5580d6e5fb)
* Office for National Statistics: [Does the axis have to start at zero? (Part 2 – bar charts)](https://blog.ons.digital/2016/07/19/does-the-axis-have-to-start-at-zero-part-2-bar-charts/)


#### Line + column 

A good way of showing the relationship over time between an amount (columns) and a rate (line)

#### Stock price 

Usually focused on day-to-day activity, these charts show opening/closing and hi/low points of each day 

#### Slope 

Good for showing changing data as long as the data can be simplified into 2 or 3 points without missing a key part of story 

#### Area chart 

Use with care – these are good at showing changes to total, but seeing change in components can be very difficult 

#### Fan chart (projection) 

Use to show the uncertainty in future projections - usually this grows the further forward to projection 

#### Connected scatterplot 

A good way of showing changing data for two variables whenever there is a relatively clear pattern of progression. 

#### Calendar heatmap 

A great way of showing temporal patterns (daily, weekly, monthly) – at the expense of showing precision in quantity. 

#### Priestley timeline 

Great when date and duration are key elements of the story in the data.

* Chart Doctor: [Communicating with data: Timelines](https://www.ft.com/content/6f777c84-322b-11e6-ad39-3fee5ffe5b5b)
* *Examples:* [_FT_](https://www.ft.com/content/e7591532-9338-11e6-a1dc-bdf38d484582)

#### Circle timeline 

Good for showing discrete values of varying size across multiple categories (eg earthquakes by contintent). 

#### Seismogram 

Another alternative to the circle timeline for showing series where there are big variations in the data.

### Part-to-whole

Show how a single entity can bebroken down into its component elements. If the reader’s interest issolely in the size of the components,consider a magnitude-type chartinstead. *Example FT uses:* Fiscal budgets, company structures,national election results

* Flowing Data: [9 Ways to Visualize Proportions – A Guide](http://flowingdata.com/2009/11/25/9-ways-to-visualize-proportions-a-guide/)

#### Stacked column

A simple way of showing part-to-whole relationships but can be difficult to read with more than a few components.

* Robert Kosara: [Stacked bars are the worst](https://eagereyes.org/techniques/stacked-bars-are-the-worst)

#### Proportional stacked bar

A good way of showing the size and proportion of data at the same time – as long as the data are not too complicated. 

* Chart Doctor: [How to apply Marimekko to data](https://www.ft.com/content/3ee98782-9149-11e7-a9e6-11d2f0ebb7f0)

#### Pie

A common way of showing part-to-whole data – but be aware that it’s difficult to accurately compare the size of the segments.

* Robert Kosara: [Ye olde pie chart debate](https://eagereyes.org/blog/2015/ye-olde-pie-chart-debate)
* Robert Kosara: [Pie Charts – Unloved, Unstudied, and Misunderstood](https://eagereyes.org/talk/pie-charts-unloved-unstudied-and-misunderstood)
* Robert Kosara: [An Illustrated Tour of the Pie Chart Study Results](https://eagereyes.org/blog/2016/an-illustrated-tour-of-the-pie-chart-study-results)
* David Robinson: [How to replace a pie chart](http://varianceexplained.org/r/improving-pie-chart/)
* Office for National Statistics: [The humble pie chart: part 1](https://blog.ons.digital/2017/01/24/the-humble-pie-chart-part1/)
* Office for National Statistics: [The humble pie chart: part 2](https://blog.ons.digital/2017/02/23/the-humble-pie-chart-part2/)
* Ian Spence: [No humble pie: The origins and usage of a statistical chart](http://www.psych.utoronto.ca/users/spence/Spence%202005.pdf)
* Jeff Clark: [In defense of pie charts](http://www.neoformix.com/2007/InDefenseOfPieCharts.html)
* Stephen Few: [Save the Pies for Dessert](https://www.perceptualedge.com/articles/visual_business_intelligence/save_the_pies_for_dessert.pdf)


#### Donut

Similar to a pie chart – but the centre can be a good way of making space to include more information about the data (eg. total) 

#### Treemap

Use for hierarchical part-to-whole relationships; can be difficult to read when there are many small segments.

#### Voronoi

A way of turning points into areas – any point within each area is closer to the central point than any other centroid.

#### Arc

A hemicycle, often used for visualising political results in parliaments.

#### Gridplot

Good for showing % information, they work best when used on whole numbers and work well in multiple layout form.

#### Venn

Generally only used for schematic representation

#### Waterfall

Can be useful for showing part-to-whole relationships where some of the components are negative.

### Magnitude

Show size comparisons. These can berelative (just being able to seelarger/bigger) or absolute (need tosee fine differences). Usually theseshow a ‘counted’ number (for example, barrels, dollars or people) rather thana calculated rate or per cent. *Example FT uses:* Commodity production, marketcapitalisation

#### Column

The standard way to compare the size of things. Must always start at 0 on the axis

#### Bar

See above. Good when the data are not time series and labels have long category names.

#### Paired column

As per standard column but allows for multiple series. Can become tricky to read with more than 2 series.

#### Paired bar

See above.

#### Proportional stacked bar

A good way of showing the size and proportion of data at the same time – as long as the data are not too complicated.

* Chart Doctor: [How to apply Marimekko to data](https://www.ft.com/content/3ee98782-9149-11e7-a9e6-11d2f0ebb7f0)

#### Proportional symbol

Use when there are big variations between values and/or seeing fine differences between data is not so important.

#### Isotype (pictogram)

Excellent solution in some instances – use only with whole numbers (do not slice off an arm to represent a decimal).

#### Lollipop chart

Lollipop charts draw more attention to the data value than standard bar/column – does not HAVE to start at zero (but preferable).

#### Radar chart

A space-efficient way of showing value pf multiple variables– but make sure they are organised in a way that makes sense to reader.

#### Parallel coordinates

An alternative to radar charts – again, the arrngement of the variables is important. Usually benefits from highlighting values.

### Spatial

Used only when precise locations orgeographical patterns in data aremore important to the reader thananything else. *Example FT uses:* Locator maps, population density,natural resource locations, naturaldisaster risk/impact, catchment areas, variation in election results

* Chart Doctor: [Use fewer maps to illustrate data better](https://www.ft.com/content/de3ef722-9514-11e6-a1dc-bdf38d484582)
* Matthew Ericson: [When Maps Shouldn’t Be Maps](http://www.ericson.net/content/2011/10/when-maps-shouldnt-be-maps/)
* Mapbox: [7 data visualization techniques for location](https://blog.mapbox.com/7-data-visualizations-techniques-for-location-544c558cc960)

#### Basic choropleth (rate/ratio)

The standard approach for putting data on a map – should always be rates rather than totals and use a sensible base geography

* Vox: [The bad map we see every presidential election](http://www.vox.com/2016/5/17/11686328/bad-election-map)
* Vox: [This “bad” election map? It’s not so bad.](http://www.vox.com/2016/6/2/11828628/election-maps-hard)
* UX•Blog: [Telling the truth](http://uxblog.idvsolutions.com/2011/10/telling-truth.html)

#### Proportional symbol (count/magnitde)

Use for totals rather than rates – be wary that small differences in data will be hard to see.

* Stephen Few: [What Can’t Be Built with Bricks?](https://www.perceptualedge.com/blog/?p=1627)

#### Flow map

For showing unambiguous movement across a map.

#### Contour map

For showing areas of equal value on a map. Can use deviation colour schemes for showing +/- values

#### Equalised cartogram

Converting each unit on a map to a regular and equally-sized shape – good for representing voting regions with equal value.

* Chart Doctor: [How the FT explained Brexit](https://www.ft.com/content/3bfc0aac-4ccd-11e6-88c5-db83e98a590a)
* 5W Blog: [The power of cartograms and creating them easily](https://5wvelascoblog.com/2016/10/27/the-power-of-cartograms-and-creating-them-easily/)

#### Scaled cartogram (value)

Stretching and shrinking a map so that each area is sized according to a particular value.

* Chart Doctor: [The search for a better US election map](https://www.ft.com/content/3685bf9e-a4cc-11e6-8b69-02899e8bd9d1)
* 5W Blog: [The power of cartograms and creating them easily](https://5wvelascoblog.com/2016/10/27/the-power-of-cartograms-and-creating-them-easily/)
* Vox: [The bad map we see every presidential election](https://www.youtube.com/watch?v=hlQE4IGFc5A)

#### Dot density

Used to show the location of individual events/locations – make sure to annotate any patterns the reader should see.

* Chart Doctor: [The search for a better US election map](https://www.ft.com/content/3685bf9e-a4cc-11e6-8b69-02899e8bd9d1)

#### Heat map

Grid-based data values mapped with an intensity colour scale. As choropleth map – but not snapped to an admin/political unit.

* 5W Blog: [The power of cartograms and creating them easily](https://5wvelascoblog.com/2016/10/27/the-power-of-cartograms-and-creating-them-easily/)

### Flow

Show the reader volumes or intensity of movement between two or more states or conditions. These might belogical sequences or geographical locations. *Example FT uses:* Movement of funds, trade, migrants, lawsuits, information; relationship graphs.

* RJ Andrews: [Picturing the Great Migration](https://medium.com/info-we-trust/picturing-the-great-migration-9e4b5a3eca8a)

#### Sankey (aka river plot)

Shows changes in flows from one condition to at least one other; good for tracing the eventual outcome of a complex process. 

* Chart Doctor: [Data visualisation: it is not all about technology](https://www.ft.com/content/aba6c58e-5a8e-11e7-9bc8-8055f264aa8b)

#### Waterfall

Designed to show the sequencing of data through a flow process, typically budgets. Can include +/- components.

#### Chord

A complex but powerful diagram which can illustrate 2-way flows (and net winner) in a matrix.

#### Network

Used for showing the strength and inter-connectedness of relationships of varying types. 

- - - 

Todo:

### Uncertainty

* Scientific American: [Visualising uncertain weather](https://blogs.scientificamerican.com/sa-visual/visualizing-uncertain-weather/)
* Oli Hawkins: [Animating uncertainty](http://olihawkins.com/2013/09/2)

### Animation

* Chart Doctor: [The storytelling genius of unveiling truths through charts](https://www.ft.com/content/e2eba288-ef83-11e6-930f-061b01e23655)
* Evan Sinar: [Use Animation to Supercharge Data Visualization](https://medium.com/@EvanSinar/use-animation-to-supercharge-data-visualization-cd905a882ad4)

### Interactivity

* Chart Doctor: [Why the FT creates so few clickable graphics](https://www.ft.com/content/c62b21c6-7feb-11e6-8e50-8ec15fb462f4)
* Gregor Aisch: [In defense of interactive graphics](https://www.vis4.net/blog/posts/in-defense-of-interactive-graphics/)
* Zan Armstrong: [Why choose? Scrollytelling and steppers](https://medium.com/@zanarmstrong/why-choose-scrollytelling-steppers-155a59dd97fe))

### Map projections

### Colour


 

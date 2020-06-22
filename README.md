"# Runoff Rainfall"

 To calculate the runoff from any given rainfall: Take the dimensions of the footprint of the roof and convert them to inches. (So, a 50' x 20' roof is 600" x 240"). Multiply the roof dimensions by the number of inches of rainfall. In this example, 600" x 240" x 1" = 144,000 cubic inches of water. Divide that result by 231 to get the number of gallons (because 1 gallon = 231 cubic inches). (144,000/231 = 623.38).
 
  
	BEGIN
		Prompt for roofDimension1 (footprint)
		Get roofDimension1
		Prompt for roofDimension2 (footprint)
		Get roofDimension2
		Roofd1= roofDimension1 * 12
		Roofd2= roofDimension2 * 12
		Prompt user for NumOfInches
		Get NumOfInches
		Cubic inches of water = roofD1 * roofD2 * numOfInches
		Numofgallons=Cubic inches of water/231
		Display Numberofgallons
	
	END

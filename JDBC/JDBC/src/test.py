#write sciprt to test the pair trading strategy
import sys
sys.path.append('..')
import module
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
import datetime
import statsmodels.api as sm
import statsmodels.tsa.stattools as ts
import statsmodels.tsa.vector_ar.vecm as vm

#load data
data = module.load_data()
data = data['2010-01-01':'2015-01-01']
data = data.dropna()

    

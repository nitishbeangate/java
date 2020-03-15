
# coding: utf-8

# In[71]:


import pandas as pd
import numpy as nm


# In[72]:


basefile=pd.read_csv("/home/nitish/Desktop/file_compare/basefile.csv")
metafile=pd.read_csv("/home/nitish/Desktop/file_compare/meta_data.csv")
updatedfile=pd.read_csv("/home/nitish/Desktop/file_compare/updated_file.csv")


# In[93]:


#print(base_mat_col_val.isin(updated_mat_col_val))
#print(nm.array(matched_col))
meta=nm.array(metafile.iloc[:,0])
basef_col=nm.array(basefile.columns)
print(nm.intersect1d(meta,basef_col))
#matched_col=basef_col.columns.intersection(meta.columns)
#print(matched_col)
#base_mat_col_val=basefile[matched_col]
#updated_mat_col_val=updatedfile[matched_col]
#print(basefile.columns)
#val=pd.DataFrame(basefile[matched_col])
#val2=pd.DataFrame(updatedfile[matched_col])
#print(val,val2)
#print(basefile['Name'],basefile['Email'])
#print(val.where(val.values==val2.values).notna())


# In[76]:


print(updatedfile.columns)


# In[139]:


print(basefile.columns)


# In[126]:



up_col=pd.Series(updatedfile.columns)
base_col=pd.Series(basefile.columns)
#print(pd.Series(list(set(b).intersection(set(c)))))
#print(basefile.merge(updatedfile))
#print(basefile.columns,updatedfile.columns)
print(up_col)
print(base_col)


# In[127]:


class my_dictionary(dict): 
  
    # __init__ function 
    def __init__(self): 
        self = dict() 
          
    # Function to add key:value 
    def add(self, key, value): 
        self[key] = value 
  
# Main Function 
base_file_details = my_dictionary() 
a=len(basefile)
b=len(basefile.columns)
base_file_details.add('total row',a)
base_file_details.add('total columns',b)


# In[131]:


print(meta_data())


# In[129]:


def meta_data():
    meta_col=pd.Series(metafile.iloc[:,0])
    print(meta_col)
    print(len(meta_col))


# In[130]:


def base_file(meta_col):
    


# In[ ]:


def updated_file():


import pandas as pd

csv_file_path = 'C:\\Users\\Sophytes\\Documents\\HitpickFile.csv'

df = pd.read_csv(csv_file_path)
# print(df)

split_values = df['Source_Plate'].unique()
# print(split_values)

for value in split_values:
    df1 = df[df['Source_Plate'] == value]
    output_file_name = "Source_Plate_" + str(value) + "_Plates.csv"
    df1.to_csv(output_file_name, index=False)

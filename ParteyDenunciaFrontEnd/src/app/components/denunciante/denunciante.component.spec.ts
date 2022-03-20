import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DenuncianteComponent } from './denunciante.component';

describe('DenuncianteComponent', () => {
  let component: DenuncianteComponent;
  let fixture: ComponentFixture<DenuncianteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DenuncianteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DenuncianteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
